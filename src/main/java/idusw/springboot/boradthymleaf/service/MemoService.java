package idusw.springboot.boradthymleaf.service;

import idusw.springboot.boradthymleaf.domain.Memo;

import java.util.List;

public interface MemoService {
    Memo create(Memo m);
    Memo read(Memo m);
    List<Memo> readList();
    int update(Memo m);
    int delete(Memo m);
    List<Memo> initialize();
}
