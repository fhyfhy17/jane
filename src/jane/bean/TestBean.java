// This file is generated by genbeans tool. Do NOT edit it! @formatter:off
package jane.bean;

import java.lang.reflect.Field;
import jane.core.Bean;
import jane.core.BeanPool;
import jane.core.MarshalException;
import jane.core.OctetsStream;
import jane.core.SBase;
import jane.core.SContext;
import jane.core.SContext.Wrap;

/**
 * bean的注释
 */
public final class TestBean extends Bean<TestBean>
{
	private static final long serialVersionUID = 0xbeacaa44540448ccL;
	public  static final int BEAN_TYPE = 1;
	public  static final TestBean BEAN_STUB = new TestBean();
	public  static final BeanPool<TestBean> BEAN_POOL = new BeanPool<TestBean>(BEAN_STUB, 1000);
	public  static final int TEST_CONST1 = 5; // 测试类静态常量
	public  static final String TEST_CONST2 = "test_const2";
	private static Field FIELD_value1;
	private static Field FIELD_value2;

	private /* 1*/ int value1; // 字段的注释
	private /* 2*/ long value2;

	static
	{
		try
		{
			Class<TestBean> c = TestBean.class;
			FIELD_value1 = c.getDeclaredField("value1"); FIELD_value1.setAccessible(true);
			FIELD_value2 = c.getDeclaredField("value2"); FIELD_value2.setAccessible(true);
		}
		catch(Exception e)
		{
		}
	}

	public TestBean()
	{
	}

	public TestBean(int value1, long value2)
	{
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public void reset()
	{
		value1 = 0;
		value2 = 0;
	}

	@Override
	public void assign(TestBean b)
	{
		if(b == this) return;
		if(b == null) { reset(); return; }
		this.value1 = b.value1;
		this.value2 = b.value2;
	}

	public int getValue1()
	{
		return value1;
	}

	public void setValue1(int value1)
	{
		this.value1 = value1;
	}

	public long getValue2()
	{
		return value2;
	}

	public void setValue2(long value2)
	{
		this.value2 = value2;
	}

	@Override
	public int type()
	{
		return 1;
	}

	@Override
	public TestBean stub()
	{
		return BEAN_STUB;
	}

	@Override
	public TestBean create()
	{
		return new TestBean();
	}

	@Override
	public int initSize()
	{
		return 16;
	}

	@Override
	public int maxSize()
	{
		return 16;
	}

	@Override
	public TestBean alloc()
	{
		return BEAN_POOL.alloc();
	}

	@Override
	public void free()
	{
		BEAN_POOL.free(this);
	}

	@Override
	public OctetsStream marshal(OctetsStream s)
	{
		if(this.value1 != 0) s.marshal1((byte)0x04).marshal(this.value1);
		if(this.value2 != 0) s.marshal1((byte)0x08).marshal(this.value2);
		return s.marshal1((byte)0);
	}

	@Override
	public OctetsStream unmarshal(OctetsStream s) throws MarshalException
	{
		for(;;) { int i = s.unmarshalInt1() & 0xff, t = i & 3; switch(i >> 2)
		{
			case 0: return s;
			case 1: this.value1 = s.unmarshalInt(t); break;
			case 2: this.value2 = s.unmarshalLong(t); break;
			default: s.unmarshalSkipVar(t);
		}}
	}

	@Override
	public TestBean clone()
	{
		return new TestBean(value1, value2);
	}

	@Override
	public int hashCode()
	{
		int h = 1 * 0x9e3779b1;
		h = h * 31 + 1 + this.value1;
		h = h * 31 + 1 + (int)this.value2;
		return h;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o == this) return true;
		if(!(o instanceof TestBean)) return false;
		TestBean b = (TestBean)o;
		if(this.value1 != b.value1) return false;
		if(this.value2 != b.value2) return false;
		return true;
	}

	@Override
	public int compareTo(TestBean b)
	{
		if(b == this) return 0;
		if(b == null) return 1;
		int c;
		c = this.value1 - b.value1; if(c != 0) return c;
		c = Long.signum(this.value2 - b.value2); if(c != 0) return c;
		return 0;
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder(16 + 16 * 2).append('{');
		s.append(this.value1).append(',');
		s.append(this.value2).append(',');
		s.setLength(s.length() - 1);
		return s.append('}').toString();
	}

	@Override
	public StringBuilder toJson(StringBuilder s)
	{
		if(s == null) s = new StringBuilder(1024);
		s.append('{');
		s.append("\"value1\":").append(this.value1).append(',');
		s.append("\"value2\":").append(this.value2).append(',');
		s.setLength(s.length() - 1);
		return s.append('}');
	}

	@Override
	public StringBuilder toLua(StringBuilder s)
	{
		if(s == null) s = new StringBuilder(1024);
		s.append('{');
		s.append("value1=").append(this.value1).append(',');
		s.append("value2=").append(this.value2).append(',');
		s.setLength(s.length() - 1);
		return s.append('}');
	}

	@Override
	public Safe safe(Wrap<?> parent)
	{
		return new Safe(this, parent);
	}

	@Override
	public Safe safe()
	{
		return new Safe(this, null);
	}

	public static final class Safe extends SContext.Safe<TestBean>
	{
		private Safe(TestBean bean, Wrap<?> parent)
		{
			super(bean, parent);
		}

		public int getValue1()
		{
			return _bean.value1;
		}

		public void setValue1(int value1)
		{
			if(initSContext()) _sCtx.addOnRollback(new SBase.SInteger(_bean, FIELD_value1, _bean.value1));
			_bean.value1 = value1;
		}

		public long getValue2()
		{
			return _bean.value2;
		}

		public void setValue2(long value2)
		{
			if(initSContext()) _sCtx.addOnRollback(new SBase.SLong(_bean, FIELD_value2, _bean.value2));
			_bean.value2 = value2;
		}
	}
}
