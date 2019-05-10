package code.ponfee.sequence.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 序列区间
 * @author fupf
 */
public class SequenceRange implements Serializable {

    private static final long serialVersionUID = 5770973201594506565L;

    private final long start; // 开始值
    private final long end; // 结束值
    private final AtomicLong current; // 当前值

    public SequenceRange(long start, long end) {
        this.start = start;
        this.end = end;
        this.current = new AtomicLong(start);
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public long next() {
        long value = current.getAndIncrement();
        if (value > end) value = -1;
        return value;
    }

    public long current() {
        return current.get();
    }

    @Transient
    public boolean isOver() {
        return current.get() > end;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (start ^ (start >>> 32));
        result = prime * result + (int) (end ^ (end >>> 32));
        result = prime * result + ((current == null) ? 0 : current.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        SequenceRange other = (SequenceRange) obj;
        if (start != other.start) return false;
        if (end != other.end) return false;
        if (current.get() != other.current.get()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Range [start=" + start + ", end=" + end + ", value=" + current.get() + "]";
    }
}
