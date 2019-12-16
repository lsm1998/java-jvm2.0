package com.lsm1998.jvm.interpreter.instruction.loads;

import com.lsm1998.jvm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.rtda.pri.stack.Frame;
import com.lsm1998.jvm.rtda.pub.heap.methodarea.RtObject;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:30
 * @说明：
 */
public class ALoad_2 extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        RtObject temp=frame.getLocalVars().getRef(2);
        frame.getOperandsStack().pushRef(temp);
    }

    @Override
    public String toString()
    {
        return "aload_2";
    }
}
