package com.lsm1998.jvm.interpreter.instruction.stores;

import com.lsm1998.jvm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:35
 * @说明：
 */
public class LStore_1 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        long temp=frame.getOperandsStack().popLong();
        frame.getLocalVars().setLong(1,temp);
    }

    @Override
    public String toString()
    {
        return "lstore_1";
    }
}
