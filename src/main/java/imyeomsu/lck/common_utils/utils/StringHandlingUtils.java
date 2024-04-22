package imyeomsu.lck.common_utils.utils;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringHandlingUtils {

	//정규표현식으로 04월 03일 (수) 등의 데이터를 0403으로 뽑아오기
	public static String extractDate(String dateString) {
		// 정규 표현식 패턴 설정
		Pattern pattern = Pattern.compile("(\\d{2})월 (\\d{2})일");

		// 패턴 매처 생성
		Matcher matcher = pattern.matcher(dateString);

		// 매칭된 그룹 추출
		if (matcher.find()) {
			String month = matcher.group(1);
			String day = matcher.group(2);
			return month + day;
		}

		return null;
	}


}
