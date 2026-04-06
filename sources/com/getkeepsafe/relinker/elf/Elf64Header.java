package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf64Header extends Elf.Header {

    /* renamed from: j  reason: collision with root package name */
    public final ElfParser f23807j;

    public Elf64Header(boolean z2, ElfParser elfParser) {
        this.f23792a = z2;
        this.f23807j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23793b = elfParser.g(allocate, 16);
        this.f23794c = elfParser.j(allocate, 32);
        this.f23795d = elfParser.j(allocate, 40);
        this.f23796e = elfParser.g(allocate, 54);
        this.f23797f = elfParser.g(allocate, 56);
        this.f23798g = elfParser.g(allocate, 58);
        this.f23799h = elfParser.g(allocate, 60);
        this.f23800i = elfParser.g(allocate, 62);
    }

    public Elf.DynamicStructure a(long j2, int i2) {
        return new Dynamic64Structure(this.f23807j, this, j2, i2);
    }

    public Elf.ProgramHeader b(long j2) {
        return new Program64Header(this.f23807j, this, j2);
    }

    public Elf.SectionHeader c(int i2) {
        return new Section64Header(this.f23807j, this, i2);
    }
}
