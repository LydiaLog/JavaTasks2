
public class Point3D extends Point{
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y); //何葛 积己捞 刚历
		this.z = z;
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void moveBy(int x, int y, int z) {
		//setX( getX() + x );
		moveBy(x,y);
		this.z += z;
	}
	public String toString() {
		return super.toString() + "z: " + this.z;
	}
	public boolean equals(Point3D p) {
		if( !super.equals(p) ) {
			return false;
		}
		else if(this.z == p.z) {
				return true;
		}
		else {
			return false;
		}
	
	}
}