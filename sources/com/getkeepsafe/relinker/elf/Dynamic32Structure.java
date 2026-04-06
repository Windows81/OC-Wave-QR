package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Dynamic32Structure extends Elf.DynamicStructure {
    public Dynamic32Structure(ElfParser elfParser, Elf.Header header, long j2, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(header.f23792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = j2 + ((long) (i2 * 8));
        this.f23790a = elfParser.l(allocate, j3);
        this.f23791b = elfParser.l(allocate, j3 + 4);
    }
}
