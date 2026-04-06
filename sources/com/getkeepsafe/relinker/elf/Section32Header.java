package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Section32Header extends Elf.SectionHeader {
    public Section32Header(ElfParser elfParser, Elf.Header header, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(header.f23792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23805a = elfParser.l(allocate, header.f23795d + ((long) (i2 * header.f23798g)) + 28);
    }
}
