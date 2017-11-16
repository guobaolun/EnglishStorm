package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.model.DataTablesRequest;
import com.english.storm.model.WordBean;
import com.english.storm.model.WordResult;
import com.english.storm.pojo.Word;

import java.util.ArrayList;

public interface WordService {
	EnglishStormResult addWordList(ArrayList<WordBean> wordlist);
	EnglishStormResult addWord(WordBean wordlist);
	WordResult getWordList(DataTablesRequest request);
	EnglishStormResult upWord(Word request);
	EnglishStormResult deleteWord(Word request);
}
