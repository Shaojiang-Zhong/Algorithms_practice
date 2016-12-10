class Time implements Comparable<Time>{
	int hour = 0;
	int minute = 0;
	int second = 0;
	public Time(int hour, int minute, int second) {
		// TODO Auto-generated method stub
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}
	@Override
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		if (hour < o.hour) return -1;
		else if (hour > o.hour) return 1;
		else{
			if (minute < o.minute) return -1;
			else if (minute > o.minute) return 1;
			else {
				if (second < o.second) return -1;
				else if (second > o.second) return 1;
				else return 0;
			}
		}
		
	}
}
class Event{
	String event;
	public Event(String event) {
		// TODO Auto-generated method stub
		this.event = event;

	}
}
public class OrderedSybTable {
	private Time[] times;
	private Event[] events;
	private int N;
	
	public OrderedSybTable(int capcity){
		times = new Time[capcity];
		events = new Event[capcity];
	}
	public int size(){
		return N;
	}
	public Event get(Time time){
		int i = rank(time);
		if (i < N && time.compareTo(times[i]) == 0){
			return events[rank(time)];
			}
		else return null;
	}
	public void put (Time time, Event event){
		int i = rank (time);
		if (i < N && time.compareTo(times[i]) == 0) {events[i] = event;return;}
		else {
			for (int j = N; j > i; j--){
				times[j] = times[j - 1];
				events[j] = events[j - 1];
				
			}
			times[i] = time;
			events[i] = event;
			N = N + 1 ;
		}
	}
	public Time min (){
		return times[0];
	}
	public Time max(){
		return times[N-1];
	}
	public Time select(int rank){
		return times[rank];
	}
	public Time floor(Time time){
		return times[rank(time) - 1];
	}
	public Time ceiling(Time time){
		return times[rank(time)];
	}
	public int size(Time time1, Time time2){
		return rank(time1) - rank(time2);
	}
	public int rank(Time time){
		int lo = 0; 
		int hi = N - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			int cmp = time.compareTo(times[mid]);
			if (cmp < 0) hi = mid-1;
			else if (cmp > 0) lo = mid + 1;
			else return mid;
		}
		return lo;
	}
	
	public static void main(String[] args) {
		final int capacity = Integer.parseInt(args[0]);
		OrderedSybTable ost = new OrderedSybTable(capacity);
		
	}
	

}
