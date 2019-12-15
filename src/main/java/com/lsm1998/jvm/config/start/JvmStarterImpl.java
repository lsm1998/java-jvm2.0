/*
 * 作者：刘时明
 * 时间：2019/12/15-15:17
 * 作用：启动器
 */
package com.lsm1998.jvm.config.start;

import com.lsm1998.jvm.config.JvmConfig;
import com.lsm1998.jvm.config.define.JvmStarter;
import com.lsm1998.jvm.config.define.Modes;
import com.lsm1998.jvm.vm.clazz.Method;
import com.lsm1998.jvm.vm.runtimedata.MyClassLoader;
import com.lsm1998.jvm.vm.runtimedata.publicdata.methodarea.ClassMethod;
import com.lsm1998.jvm.vm.runtimedata.publicdata.methodarea.Clazz;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@Slf4j
public class JvmStarterImpl implements JvmStarter
{
    private StarterBuilder builder;

    public JvmStarterImpl(StarterBuilder builder)
    {
        this.builder = builder;
    }

    @Override
    public JvmConfig jvmConfig()
    {
        return this.builder.getConfig();
    }

    @Override
    public void start()
    {
        String classPath = this.jvmConfig().getClassPath();
        Modes mode = this.jvmConfig().getMode();
        MyClassLoader classLoader = new MyClassLoader();
        classLoader.loadClass(classPath);
        Map<String, Clazz> clazzMap = classLoader.getMap();
        Clazz curr = clazzMap.get(classPath);
        if (mode == Modes.INFO)
        {
            log.info("类信息如下：");
            System.out.println(curr);
        } else
        {
            Optional<ClassMethod> method = Arrays.stream(curr.getMethods()).filter(m -> m.getName().equals("main") && "([Ljava/lang/String;)V".equals(m.getDescriptor())).findFirst();
            if (method.isPresent())
            {
                JvmExecute.executeMethod(method.get());
            } else
            {
                log.error("找不到主方法");
            }
        }
    }

    @Override
    public void stop()
    {
        System.exit(0);
    }
}