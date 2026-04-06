package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf32Header extends Elf.Header {

    /* renamed from: j  reason: collision with root package name */
    public final ElfParser f23806j;

    public Elf32Header(boolean z2, ElfParser elfParser) {
        this.f23792a = z2;
        this.f23806j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23793b = elfParser.g(allocate, 16);
        this.f23794c = elfParser.l(allocate, 28);
        this.f23795d = elfParser.l(allocate, 32);
        this.f23796e = elfParser.g(allocate, 42);
        this.f23797f = elfParser.g(allocate, 44);
        this.f23798g = elfParser.g(allocate, 46);
        this.f23799h = elfParser.g(allocate, 48);
        this.f23800i = elfParser.g(allocate, 50);
    }

    public Elf.DynamicStructure a(long j2, int i2) {
        return new Dynamic32Structure(this.f23806j, this, j2, i2);
    }

    public Elf.ProgramHeader b(long j2) {
        return new Program32Header(this.f23806j, this, j2);
    }

    public Elf.SectionHeader c(int i2) {
        return new Section32Header(this.f23806j, this, i2);
    }
}
