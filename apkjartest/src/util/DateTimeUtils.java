package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class DateTimeUtils {

	//时分秒
	public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
	//年月
	public static final DateTimeFormatter MONTH_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM");
	//年月日
	public static final DateTimeFormatter SHORT_DATE_FORMATTER = DateTimeFormatter.ofPattern("yy-MM-dd");
	//年月日时分秒
	public static final DateTimeFormatter SHORT_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
	//年月日时分秒
	public static final DateTimeFormatter DATETIME_FORMATTER =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	//年月日
	public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    
	    /**
	     * 返回当前的日期 eg 2018-10-29
	     * @return
	     */
	    public static LocalDate getCurrentLocalDate() {
	        return LocalDate.now();
	    }
	    
	    /**
	     * 返回当前时间  eg:16:25:37.085
	     * @return
	     */
	    public static LocalTime getCurrentLocalTime() {
	        return LocalTime.now();
	    }
	    
	    /**
	     * 返回当前日期时间
	     * @return
	     */
	    public static LocalDateTime getCurrentLocalDateTime() {
	        return LocalDateTime.now();
	    }
	    
	    /**
	     * yyyy-MM-dd
	     * 
	     * @return
	     */
	    public static String getCurrentDateStr() {
	        return LocalDate.now().format(DATE_FORMATTER);
	    }
	    
	    /**
	     * yy-MM-dd
	     * 
	     * @return
	     */
	    public static String getCurrentShortDateStr() {
	        return LocalDate.now().format(SHORT_DATE_FORMATTER);
	    }
	    
	    /**
	     * yyyy-MM
	     * @return
	     */
	    public static String getCurrentMonthStr() {
	        return LocalDate.now().format(MONTH_FORMATTER);
	    }
	    
	    /**
	     * yyyy-MM-dd HH:mm:ss
	     * @return
	     */
	    public static String getCurrentDateTimeStr() {
	        return LocalDateTime.now().format(DATETIME_FORMATTER);
	    }
	    
	    /**
	     * yy-MM-dd HH:mm:ss
	     * @return
	     */
	    public static String getCurrentShortDateTimeStr() {
	        return LocalDateTime.now().format(SHORT_DATETIME_FORMATTER);
	    }
	    
	    /**
	     * HH:mm:ss
	     * @return
	     */
	    public static String getCurrentTimeStr() {
	        return LocalTime.now().format(TIME_FORMATTER);
	    }
	    
	    /**
	     * 将今天日期转换为设定（pattern）格式
	     * @param pattern
	     * @return
	     */
	    public static String getCurrentDateStr(String pattern) {
	        return LocalDate.now().format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static String getCurrentDateTimeStr(String pattern) {
	        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    /**
	     * 将当前时间（eg 16:39:54）转换为设定（pattern）格式
	     * @param pattern
	     * @return
	     */
	    public static String getCurrentTimeStr(String pattern) {
	        return LocalTime.now().format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static LocalDate parseLocalDate(String dateStr, String pattern) {
	        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static LocalDateTime parseLocalDateTime(String dateTimeStr, String pattern) {
	        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static LocalTime parseLocalTime(String timeStr, String pattern) {
	        return LocalTime.parse(timeStr, DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static String formatLocalDate(LocalDate date, String pattern) {
	        return date.format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static String formatLocalDateTime(LocalDateTime datetime, String pattern) {
	        return datetime.format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    public static String formatLocalTime(LocalTime time, String pattern) {
	        return time.format(DateTimeFormatter.ofPattern(pattern));
	    }
	    
	    /**
	     * 转为  yyyy-MM-dd 格式
	     * @param dateStr
	     * @return
	     */
	    public static LocalDate parseLocalDate(String dateStr) {
	        return LocalDate.parse(dateStr, DATE_FORMATTER);
	    }
	    
	    /**
	     * 转为 yyyy-MM-dd HH:mm:ss 格式
	     * @param dateTimeStr
	     * @return
	     */
	    public static LocalDateTime parseLocalDateTime(String dateTimeStr) {
	        return LocalDateTime.parse(dateTimeStr, DATETIME_FORMATTER);
	    }
	    
	    public static LocalTime parseLocalTime(String timeStr) {
	        return LocalTime.parse(timeStr, TIME_FORMATTER);
	    }
	    
	    /**
	     * 转为 HH:mm:ss 格式
	     * @param date
	     * @return
	     */
	    public static String formatLocalDate(LocalDate date) {
	        return date.format(DATE_FORMATTER);
	    }
	    
	    /**
	     * 转为 yyyy-MM-dd HH:mm:ss 格式
	     * @param datetime
	     * @return
	     */
	    public static String formatLocalDateTime(LocalDateTime datetime) {
	        return datetime.format(DATETIME_FORMATTER);
	    }
	    
	    /**
	     * 转为 HH:mm:ss 格式
	     * @param time
	     * @return
	     */
	    public static String formatLocalTime(LocalTime time) {
	        return time.format(TIME_FORMATTER);
	    }
	    
	    /**
	     * 日期相隔天数
	     * @param startDateInclusive
	     * @param endDateExclusive
	     * @return
	     */
	    public static int periodDays(LocalDate startDateInclusive, LocalDate endDateExclusive) {
	        return Period.between(startDateInclusive, endDateExclusive).getDays();
	    }
	    
	    /**
	     * 日期相隔小时
	     * @param startInclusive
	     * @param endExclusive
	     * @return
	     */
	    public static long durationHours(Temporal startInclusive, Temporal endExclusive) {
	        return Duration.between(startInclusive, endExclusive).toHours();
	    }
	    
	    /**
	     * 日期相隔分钟
	     * @param startInclusive
	     * @param endExclusive
	     * @return
	     */
	    public static long durationMinutes(Temporal startInclusive, Temporal endExclusive) {
	        return Duration.between(startInclusive, endExclusive).toMinutes();
	    }
	    
	    /**
	     * 日期相隔毫秒数
	     * @param startInclusive
	     * @param endExclusive
	     * @return
	     */
	    public static long durationMillis(Temporal startInclusive, Temporal endExclusive) {
	        return Duration.between(startInclusive, endExclusive).toMillis();
	    }
	    
	    /**
	     * 是否当天
	     * @param date
	     * @return
	     */
	    public static boolean isToday(LocalDate date) {
	        return getCurrentLocalDate().equals(date);
	    }
	    
	    public static Long toEpochMilli(LocalDateTime dateTime) {
	        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	    }
}