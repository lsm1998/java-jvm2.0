package com.lsm1998.jvm.vm.interpreter.instruction.loads;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/28-14:29
 * @作用：
 */
public class FLoad_2 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
//        float temp=frame.localVars.getFloat(2);
//        frame.operandsStack.pushFloat(temp);
    }

    @Override
    public String toString()
    {
        return "fload_2";
    }
}
