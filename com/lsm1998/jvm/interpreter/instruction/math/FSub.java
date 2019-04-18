package com.lsm1998.jvm.interpreter.instruction.math;

import com.lsm1998.jvm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/26-22:13
 * @说明：整型减法
 */
public class FSub extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        /**
         * 浮点型暂不处理
         */
    }

    @Override
    public String toString()
    {
        return "fsub";
    }
}
