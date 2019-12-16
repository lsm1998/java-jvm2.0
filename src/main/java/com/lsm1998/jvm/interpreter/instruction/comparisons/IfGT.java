package com.lsm1998.jvm.interpreter.instruction.comparisons;

import com.lsm1998.jvm.interpreter.base.BranchInstruction;
import com.lsm1998.jvm.interpreter.base.BranchLogic;
import com.lsm1998.jvm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/26-23:56
 * @说明：
 */
public class IfGT extends BranchInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int val = frame.getOperandsStack().popInt();
        if (val > 0)
        {
            BranchLogic.branch(frame, this.offSet);
        }
    }

    @Override
    public String toString()
    {
        return "ifgt";
    }
}
