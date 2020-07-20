package xkt.personal.mgmt.service;

import java.util.List;

import xkt.personal.mgmt.bo.TCCommuityCheckerRela;

public interface ITCCommuityCheckerRelaService {
    //批量新增
    int insertByBatch(List<TCCommuityCheckerRela> records);
    //批量删除
    int deleteByBatch(List<TCCommuityCheckerRela> records);
}