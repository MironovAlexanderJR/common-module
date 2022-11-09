package liga.medical.medicalmonitoring.core.controller;

import liga.medical.commondto.DebugLogDto;
import liga.medical.commondto.ExceptionLogDto;
import liga.medical.medicalmonitoring.core.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("/debug")
    public void insertDebug(@RequestBody DebugLogDto debugLog) {
        logService.saveDebugLog(debugLog);
    }

    @PostMapping("/exception")
    private void insertException(@RequestBody ExceptionLogDto exceptionLog) {
        logService.saveExceptionLog(exceptionLog);
    }
}
