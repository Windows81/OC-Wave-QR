package com.google.common.cache;

@ElementTypesAreNonnullByDefault
public enum RemovalCause {
    EXPLICIT {
        public boolean f() {
            return false;
        }
    },
    REPLACED {
        public boolean f() {
            return false;
        }
    },
    COLLECTED {
        public boolean f() {
            return true;
        }
    },
    EXPIRED {
        public boolean f() {
            return true;
        }
    },
    SIZE {
        public boolean f() {
            return true;
        }
    };

    public abstract boolean f();
}
