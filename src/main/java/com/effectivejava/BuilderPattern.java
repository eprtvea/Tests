package com.effectivejava;


//BuilderPattern bp = new BuilderPattern.Builder(10,10).build3(0).build();

public class BuilderPattern {
	
	private final int build1;
	private final int build2;
	private final int build3;
	private final int build4;
	private final int build5;
	private final int build6;
	
	public static class Builder {
		private final int build1;
		private final int build2;
		
		//optional
		private int build3=0;
		private int build4=0;
		private int build5=0;
		private int build6=0;
		
		public Builder(int build1, int build2) {
			this.build1 = build1;
			this.build2 = build2;
		}
		
		public Builder build3(int build3) {
			this.build3 = build3;
			return this;
		}
		
		public Builder build4(int build4) {
			this.build4 = build4;
			return this;
		}
		public Builder build5(int build5) {
			this.build5 = build5;
			return this;
		}
		public Builder build6(int build6) {
			this.build6 = build6;
			return this;
		}
		
		public BuilderPattern build(){
			return new BuilderPattern(this);
		} 
		
		
	}
	
	private BuilderPattern(Builder builder) {
		build1 = builder.build1;
		build2 = builder.build2;
		build3 = builder.build3;
		build4 = builder.build4;
		build5 = builder.build5;
		build6 = builder.build6;
	}
	
	
}
