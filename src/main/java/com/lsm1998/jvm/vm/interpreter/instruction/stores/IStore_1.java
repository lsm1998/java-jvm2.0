package com.lsm1998.jvm.vm.interpreter.instruction.stores;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:33
 * @说明：
 */
public class IStore_1 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int temp=frame.getOperandsStack().popInt();
        frame.getLocalVars().setInt(1,temp);
    }

    @Override
    public String toString()
    {
        return "istore_1";
    }
}
