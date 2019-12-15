package com.lsm1998.jvm.vm.interpreter.instruction.constants;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:00
 * @说明：
 */
public class IConst_2 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        frame.getOperandsStack().pushInt(2);
    }

    @Override
    public String toString()
    {
        return "iconst_2";
    }
}
