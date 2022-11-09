package liga.medical.medicalmonitoring.core.service;

import liga.medical.commondto.DebugLogDto;
import liga.medical.commondto.ExceptionLogDto;

public interface LogService {

    void saveDebugLog(DebugLogDto debugLog);

    void saveExceptionLog(ExceptionLogDto debugLog);
}
