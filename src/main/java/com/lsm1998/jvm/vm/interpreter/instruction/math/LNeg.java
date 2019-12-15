package com.lsm1998.jvm.vm.interpreter.instruction.math;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/28-21:12
 * @说明：
 */
public class LNeg extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        long val= frame.operandsStack.popLong();
        frame.operandsStack.pushLong(-val);
    }

    @Override
    public String toString()
    {
        return "lneg";
    }
}