package com.rankingEnZymes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankingEnZymes.model.FinalCAZymes.FinalCAZvType;
import com.rankingEnZymes.repository.FinalCAZvRepository;

@Service
public class DefaultFinalCAZvTypeService implements FinalCAZvService {

	@Autowired
	FinalCAZvRepository FinalCAZvRepository;

	@Override
	public FinalCAZvType find(String key) {
		// TODO Auto-generated method stub
		return FinalCAZvRepository.findById(key).get();
	}

	@Override
	public List<FinalCAZvType> getAll() {
		// TODO Auto-generated method stub
		return toList(FinalCAZvRepository.findAll());
	}

	public static <E> List<E> toList(Iterable<E> iterable) {
		if (iterable instanceof List) {
			return (List<E>) iterable;
		}
		ArrayList<E> list = new ArrayList<E>();
		if (iterable != null) {
			for (E e : iterable) {
				list.add(e);
			}
		}
		return list;
	}



	@Override
	public FinalCAZvType get(String id) {
		// TODO Auto-generated method stub
		try {
		return	FinalCAZvRepository.findById(id).get();
		}
		catch(NoSuchElementException e) {
			return null;
		}
		
	}

	@Override
	public void add(FinalCAZvType entity) {
		// TODO Auto-generated method stub
		FinalCAZvRepository.save(entity);

	}

	@Override
	public void saveOrUpdate(FinalCAZvType entity) {
		// TODO Auto-generated method stub
		FinalCAZvRepository.save(entity);

	}

	@Override
	public void update(FinalCAZvType entity) {
		// TODO Auto-generated method stub
		FinalCAZvRepository.save(entity);

	}

	@Override
	public void remove(FinalCAZvType entity) {
		// TODO Auto-generated method stub
		FinalCAZvRepository.delete(entity);

	}

	@Override
	public FinalCAZvType getById(String id) {
		// TODO Auto-generated method stub
		return FinalCAZvRepository.findById(id).get();
	}


}
