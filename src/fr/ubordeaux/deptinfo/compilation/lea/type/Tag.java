package fr.ubordeaux.deptinfo.compilation.lea.type;

public enum Tag {
		CHAR(1), INTEGER(2), BOOLEAN(1), FLOAT(4), STRING(256), LIST(4), SET(4), MAP(0), RANGE(0), FUNCTION(0),
		CLASS(0), PRODUCT(0), FIELD(0), ENUM(2), NAME(0), VOID(0);

		private int size;

		Tag(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}

	}

