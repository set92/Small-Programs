// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package rmi.print.server;

public final class ServidorSumaResta_Stub
    extends java.rmi.server.RemoteStub
    implements rmi.print.common.InterfazSumaResta, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_resta_0;
    private static java.lang.reflect.Method $method_suma_1;
    
    static {
	try {
	    $method_resta_0 = rmi.print.common.InterfazSumaResta.class.getMethod("resta", new java.lang.Class[] {int.class, int.class});
	    $method_suma_1 = rmi.print.common.InterfazSumaResta.class.getMethod("suma", new java.lang.Class[] {int.class, int.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public ServidorSumaResta_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of resta(int, int)
    public int resta(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_resta_0, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, 2218719310559634758L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of suma(int, int)
    public int suma(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_suma_1, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, -6163884913801339142L);
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