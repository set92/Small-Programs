// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package rmi.print.server;

public final class RemotePrinterImpl_Stub
    extends java.rmi.server.RemoteStub
    implements rmi.print.common.RemotePrinter, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_getPrinterStatus_0;
    private static java.lang.reflect.Method $method_isComplete_1;
    private static java.lang.reflect.Method $method_simpleRemoteMethod_2;
    private static java.lang.reflect.Method $method_submitJob_3;
    
    static {
	try {
	    $method_getPrinterStatus_0 = rmi.print.common.RemotePrinter.class.getMethod("getPrinterStatus", new java.lang.Class[] {});
	    $method_isComplete_1 = rmi.print.common.RemotePrinter.class.getMethod("isComplete", new java.lang.Class[] {});
	    $method_simpleRemoteMethod_2 = rmi.print.common.RemotePrinter.class.getMethod("simpleRemoteMethod", new java.lang.Class[] {java.lang.String.class});
	    $method_submitJob_3 = rmi.print.common.RemotePrinter.class.getMethod("submitJob", new java.lang.Class[] {java.lang.String.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public RemotePrinterImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of getPrinterStatus()
    public java.lang.String getPrinterStatus()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getPrinterStatus_0, null, -3624826617011507161L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isComplete()
    public boolean isComplete()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_isComplete_1, null, -1556684322884218357L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of simpleRemoteMethod(String)
    public java.lang.String simpleRemoteMethod(java.lang.String $param_String_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_simpleRemoteMethod_2, new java.lang.Object[] {$param_String_1}, 2752702000595150692L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of submitJob(String)
    public int submitJob(java.lang.String $param_String_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_submitJob_3, new java.lang.Object[] {$param_String_1}, -1033171104106073084L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
