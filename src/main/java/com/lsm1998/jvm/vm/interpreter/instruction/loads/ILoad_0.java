package com.lsm1998.jvm.vm.interpreter.instruction.loads;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.runtimedata.privatedata.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:15
 * @说明：
 */
public class ILoad_0 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        int temp=frame.localVars.getInt(0);
        frame.operandsStack.pushInt(temp);
    }

    @Override
    public String toString()
    {
        return "iload_0";
    }
}
