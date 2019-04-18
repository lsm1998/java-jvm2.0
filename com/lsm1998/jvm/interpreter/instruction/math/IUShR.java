package com.lsm1998.jvm.interpreter.instruction.math;

import com.lsm1998.jvm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/26-22:35
 * @说明：无符号右移
 */
public class IUShR extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int val1=frame.operandsStack.popInt();
        int val2=frame.operandsStack.popInt();
        int result=val1>>>val2;
        frame.operandsStack.pushInt(result);
    }

    @Override
    public String toString()
    {
        return "iushr";
    }
}
