package com.juice.orange.account.persist;

public interface AccountPersistService {
	public abstract Account createAccount(Account account) throws AccountPersistException;

	public abstract Account readAccount(String id) throws AccountPersistException;

	public abstract Account updateAccount(Account account) throws AccountPersistException;

	public abstract void deleteAccount(String id) throws AccountPersistException;
}
