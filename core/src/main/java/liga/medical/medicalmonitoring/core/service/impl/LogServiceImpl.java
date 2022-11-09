package liga.medical.medicalmonitoring.core.service.impl;

import liga.medical.commondto.DebugLogDto;
import liga.medical.commondto.ExceptionLogDto;
import liga.medical.medicalmonitoring.core.entity.DebugLog;
import liga.medical.medicalmonitoring.core.entity.ExceptionLog;
import liga.medical.medicalmonitoring.core.repository.LogRepository;
import liga.medical.medicalmonitoring.core.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;

    @Override
    public void saveDebugLog(DebugLogDto debugLogDto) {
        DebugLog debugLog = new DebugLog();
        debugLog.setSystemTypeId(debugLogDto.getSystemTypeId());
        debugLog.setMethodParams(debugLogDto.getMethodParams());
        logRepository.save(debugLog);
    }

    @Override
    public void saveExceptionLog(ExceptionLogDto exceptionLogDto) {
        ExceptionLog exceptionLog = new ExceptionLog();
        exceptionLog.setSystemTypeId(exceptionLogDto.getSystemTypeId());
        exceptionLog.setMethodParams(exceptionLogDto.getMethodParams());
        logRepository.save(exceptionLog);
    }
}
