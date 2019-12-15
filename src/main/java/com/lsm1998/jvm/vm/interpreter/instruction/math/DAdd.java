package com.lsm1998.jvm.vm.interpreter.instruction.math;

import com.lsm1998.jvm.vm.interpreter.base.NoOperandsInstruction;
import com.lsm1998.jvm.vm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/26-22:12
 * @说明：双精度浮点型加法
 */
public class DAdd extends NoOperandsInstruction
{
    @Override
    public void execute(Frame frame)
    {
        /**
         * 浮点型暂不处理
         */
    }

    @Override
    public String toString()
    {
        return "dadd";
    }
}
