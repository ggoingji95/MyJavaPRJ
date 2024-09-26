
package impl;


import dto.NoticeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mapper.INoticeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service

public class NoticeService implements INoticeService {
    
    private final INoticeMapper noticeMapper;
    
    
    @Override
    public List<NoticeDTO> getNoticeList() throws Exception{
        return null;
        
    }
