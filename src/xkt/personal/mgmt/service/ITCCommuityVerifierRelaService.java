package xkt.personal.mgmt.service;

import java.util.List;

import xkt.personal.mgmt.bo.TCCommuityVerifierRela;

public interface ITCCommuityVerifierRelaService {
    //批量新增
    int insertByBatch(List<TCCommuityVerifierRela> records);
    //批量删除
    int deleteByBatch(List<TCCommuityVerifierRela> records);
}