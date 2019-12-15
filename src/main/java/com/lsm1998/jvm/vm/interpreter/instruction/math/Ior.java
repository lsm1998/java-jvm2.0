package com.lsm1998.jvm.vm.interpreter.instruction.math;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/28-22:29
 * @说明：
 */
public class Ior extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int val1=frame.operandsStack.popInt();
        int val2=frame.operandsStack.popInt();
        int result=val1|val2;
        frame.operandsStack.pushInt(result);
    }

    @Override
    public String toString()
    {
        return "ior";
    }
}
