package service.impl;

import liga.medical.medicalmonitoring.core.entity.Log;
import liga.medical.medicalmonitoring.core.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.LogService;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;

    @Override
    public void saveLog(Log log) {
        logRepository.save(log);
    }
}
