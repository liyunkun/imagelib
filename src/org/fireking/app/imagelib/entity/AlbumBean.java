package org.fireking.app.imagelib.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AlbumBean {

	public String folderName;

	public int count;

	public List<ImageBean> sets = new ArrayList<ImageBean>();

	public String thumbnail;

	public AlbumBean() {
		super();
	}

	public AlbumBean(String folderName, int count, List<ImageBean> sets,
			String thumbnail) {
		super();
		this.folderName = folderName;
		this.count = count;
		this.sets = sets;
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "AlbumBean [folderName=" + folderName + ", count=" + count
				+ ", sets=" + sets + ", thumbnail=" + thumbnail + "]";
	}

}
