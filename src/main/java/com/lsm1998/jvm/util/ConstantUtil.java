package com.lsm1998.jvm.util;

import com.lsm1998.jvm.vm.clazz.ClassFile;
import com.lsm1998.jvm.vm.clazz.constant.ConstantInfo;
import com.lsm1998.jvm.vm.clazz.constant.impl.ConstantClassInfo;
import com.lsm1998.jvm.vm.clazz.constant.impl.ConstantStringInfo;
import com.lsm1998.jvm.vm.clazz.constant.impl.ConstantUTF8Info;

/**
 * @作者：刘时明
 * @时间：2019/3/30-16:59
 * @说明：
 */
public class ConstantUtil
{
    /**
     * 根据下标获取常量池的值
     *
     * @param classFile
     * @param index
     * @param clazz
     * @return
     */
    public static String getStringByConstantIndex(ClassFile classFile, int index, Class<? extends ConstantInfo> clazz)
    {
        ConstantInfo[] constantInfos = classFile.getConstantInfos();
        if (clazz == ConstantClassInfo.class)
        {
            ConstantClassInfo info = (ConstantClassInfo) (constantInfos[index]);
            return info == null ? null : constantInfos[info.index].toString();
        } else if (clazz == ConstantUTF8Info.class)
        {
            ConstantUTF8Info info = (ConstantUTF8Info) constantInfos[index];
            return info.value;
        } else if (clazz == ConstantStringInfo.class)
        {
            ConstantStringInfo info = (ConstantStringInfo) constantInfos[index];
            return constantInfos[info.index].toString();
        } else
        {
            return null;
        }
    }

    public static String getStringByClassInfoIndex(ClassFile classFile, int index)
    {
        return getStringByConstantIndex(classFile, index, ConstantClassInfo.class);
    }

    public static String getStringByMethodTypeIndex(ClassFile classFile, int index)
    {
        return getStringByConstantIndex(classFile, index, ConstantStringInfo.class);
    }

    public static String getStringByUTF8Index(ClassFile classFile, int index)
    {
        return getStringByConstantIndex(classFile, index, ConstantUTF8Info.class);
    }

    /**
     * 获取一个类实现的接口名称
     *
     * @param classFile
     * @return
     */
    public static String[] getInterfaceNames(ClassFile classFile)
    {
        int[] interfaces = classFile.getInterfaces();
        String[] arr = new String[interfaces.length];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = classFile.getConstantInfos()[interfaces[i]].toString();
        }
        return arr;
    }
}
