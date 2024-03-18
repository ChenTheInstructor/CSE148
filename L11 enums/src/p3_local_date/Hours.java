package p3_local_date;

public enum Hours {
	EARLY_MORNING(new TimeRange(7, 0, 7, 59)), MORNING(new TimeRange(8, 0, 11, 59)),
	AFTERNOON(new TimeRange(12, 0, 14, 59)), MID_AFTERNOON(new TimeRange(15, 0, 15, 59)),
	LATE_AFTERNOON(new TimeRange(16, 0, 17, 59)), EVENING(new TimeRange(18, 0, 21, 59));

	private TimeRange timeRange;

	private Hours(TimeRange timeRange) {
		this.timeRange = timeRange;
	}

	public TimeRange getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(TimeRange timeRange) {
		this.timeRange = timeRange;
	}

}
