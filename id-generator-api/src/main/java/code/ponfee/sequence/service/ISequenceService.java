package code.ponfee.sequence.service;

import code.ponfee.sequence.exception.SequenceIsOverException;
import code.ponfee.sequence.exception.SequenceNotFoundException;
import code.ponfee.sequence.model.SequenceRange;

/**
 * sequence generate center服务
 * @author fupf
 */
public interface ISequenceService {

    /**
     * 申请单个序列
     * @param name
     * @return
     */
    long nextValue(String name) throws SequenceIsOverException, SequenceNotFoundException;

    /**
     * 申请区间序列
     * @param name
     * @param size
     * @return
     */
    SequenceRange nextRange(String name, int size) throws SequenceIsOverException, SequenceNotFoundException;

    /**
     * 申请单个序列（连续）
     * @param name
     * @return
     */
    long nextSerial(String name) throws SequenceIsOverException, SequenceNotFoundException;
}
