package p3_local_date;

import java.time.LocalTime;

public class TimeRange {
	private LocalTime startTime;
	private LocalTime endTime;
	
	public TimeRange(int h1, int m1, int h2, int m2) {
		startTime = LocalTime.of(h1, m1);
		endTime = LocalTime.of(h2, m2);
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "TimeRange [startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}
