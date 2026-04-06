package com.google.common.io;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

@ElementTypesAreNonnullByDefault
public final class Files {

    /* renamed from: a  reason: collision with root package name */
    public static final SuccessorsFunction f29017a = new SuccessorsFunction<File>() {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r2 = r2.listFiles();
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Iterable a(java.io.File r2) {
            /*
                r1 = this;
                boolean r0 = r2.isDirectory()
                if (r0 == 0) goto L_0x0015
                java.io.File[] r2 = r2.listFiles()
                if (r2 == 0) goto L_0x0015
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                return r2
            L_0x0015:
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.D()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.Files.AnonymousClass2.a(java.io.File):java.lang.Iterable");
        }
    };

    /* renamed from: com.google.common.io.Files$1  reason: invalid class name */
    class AnonymousClass1 implements LineProcessor<List<String>> {
    }

    public static final class FileByteSink extends ByteSink {

        /* renamed from: a  reason: collision with root package name */
        public final File f29018a;

        /* renamed from: b  reason: collision with root package name */
        public final ImmutableSet f29019b;

        public String toString() {
            String valueOf = String.valueOf(this.f29018a);
            String valueOf2 = String.valueOf(this.f29019b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20 + valueOf2.length());
            sb.append("Files.asByteSink(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class FileByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final File f29020a;

        /* renamed from: b */
        public FileInputStream a() {
            return new FileInputStream(this.f29020a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f29020a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Files.asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY {
            /* renamed from: f */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE {
            /* renamed from: f */
            public boolean apply(File file) {
                return file.isFile();
            }

            public String toString() {
                return "Files.isFile()";
            }
        }
    }
}
