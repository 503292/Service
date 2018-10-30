package net.ukr;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.security.Provider.Service;

public interface ServiceServer extends Remote {
	Object[] getServiceList() throws RemoteException;
	Service getService(Object serviceKey) throws RemoteException;

}
