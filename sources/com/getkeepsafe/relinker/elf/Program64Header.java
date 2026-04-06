package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Program64Header extends Elf.ProgramHeader {
    public Program64Header(ElfParser elfParser, Elf.Header header, long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(header.f23792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = header.f23794c + (j2 * ((long) header.f23796e));
        this.f23801a = elfParser.l(allocate, j3);
        this.f23802b = elfParser.j(allocate, 8 + j3);
        this.f23803c = elfParser.j(allocate, 16 + j3);
        this.f23804d = elfParser.j(allocate, j3 + 40);
    }
}
