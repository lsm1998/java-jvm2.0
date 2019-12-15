package com.lsm1998.jvm.vm.interpreter.instruction.comparisons;

import com.lsm1998.jvm.vm.interpreter.base.BranchInstruction;
import com.lsm1998.jvm.vm.interpreter.base.BranchLogic;
import com.lsm1998.jvm.vm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/26-23:47
 * @说明：
 */
public class If_IcmpGT extends BranchInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int val2=frame.operandsStack.popInt();
        int val1=frame.operandsStack.popInt();
        if(val1>val2)
        {
            BranchLogic.branch(frame,this.offSet);
        }
    }

    @Override
    public String toString()
    {
        return "if_icmpgt";
    }
}
