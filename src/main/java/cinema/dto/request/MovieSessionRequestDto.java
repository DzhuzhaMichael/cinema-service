package cinema.dto.request;

import cinema.util.DateTimePatternUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
public class MovieSessionRequestDto {
    @Positive
    private Long movieId;
    @Positive
    private Long cinemaHallId;
    @NotNull
    @FutureOrPresent
    @JsonFormat(pattern = DateTimePatternUtil.DATE_TIME_PATTERN)
    private LocalDateTime showTime;
}
