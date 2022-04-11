package dev.ibraheem.project1;

import java.util.Objects;

public class StatusInfo {
		// fields
		private int status_id;
		private String status_name;
		private long status_date_time;
		
		// constructor
			public StatusInfo()	{
				status_id = status_id;
				status_name = status_name;
				status_date_time = status_date_time;
			}
		// getters and setters
		public int getStatus_id() {
			return status_id;
		}
	
		public void setStatus_id(int status_id) {
			this.status_id = status_id;
		}
	
		public String getStatus_name() {
			return status_name;
		}
	
		public void setStatus_name(String status_name) {
			this.status_name = status_name;
		}
	
		public long getStatus_date_time() {
			return status_date_time;
		}
	
		public void setStatus_date_time(long status_date_time) {
			this.status_date_time = status_date_time;
		}
		@Override
		public String toString() {
			return "StatusInfo [status_id=" + status_id + ", status_name=" + status_name + ", status_date_time="
					+ status_date_time + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(status_date_time, status_id, status_name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StatusInfo other = (StatusInfo) obj;
			return status_date_time == other.status_date_time && status_id == other.status_id
					&& Objects.equals(status_name, other.status_name);
		}
	
	}
