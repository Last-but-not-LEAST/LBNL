package kr.co.chunjaeshop.notice.service;

import kr.co.chunjaeshop.notice.dto.NoticeDTO;

import java.util.List;

public interface NoticeService {


    // 남원우


    // 최경락


    // 이무현
    int noticeSave(NoticeDTO noticeDTO);

    List<NoticeDTO> noticeAllList();

    NoticeDTO findByIdx(Integer idx);

    void delete(Integer idx);

    void update(NoticeDTO noticeDTO);

    // 유지호


    // 변재혁

}
