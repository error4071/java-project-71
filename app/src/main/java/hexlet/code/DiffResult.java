package hexlet.code;

public class DiffResult {
	private Object file1;
	private Object file2;
	public DiffResult(Object file1, Object file2) {
		this.file1 = file1;
		this.file2 = file2;
	}
	public Object getFile1() {
		return file1;
	}
	public Object getFile2() {
		return file2;
	}
}
