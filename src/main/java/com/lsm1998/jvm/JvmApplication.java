/*
 * 作者：刘时明
 * 时间：2019/12/15-12:48
 * 作用：启动类
 */
package com.lsm1998.jvm;

import com.lsm1998.jvm.config.CmdParse;
import com.lsm1998.jvm.config.define.JvmStarter;
import com.lsm1998.jvm.config.define.Modes;
import com.lsm1998.jvm.config.start.StarterBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JvmApplication
{
    public static void main(String[] args)
    {
        // 1.CMD命令解析
        CmdParse parse = CmdParse.getInstance(args);
        // 2.构造JVM启动器
        JvmStarter starter = new StarterBuilder()
                .parse(parse)
                .hello("我的JVM")
                // 指定class文件路径
                .classPath("C:\\Users\\Administrator\\IdeaProjects\\jvm\\target\\test-classes\\Hello.class")
                // 指定模式为运行
                .mode(Modes.RUN)
                .build();
        // 3.启动
        starter.start();
    }
}