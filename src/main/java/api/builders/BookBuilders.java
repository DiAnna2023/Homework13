package api.builders;

import api.dto.request.book.AddBookDto;
import api.dto.request.book.IsbnDto;

import java.util.List;

public class BookBuilders {

    public AddBookDto defaultBookDtoBuilder() {
        return AddBookDto.builder()
                .userId("20dd0c3e-a956-4794-b723-1db596966bf0")
                .collectionOfIsbns(List.of(IsbnDto.builder().isbn("9781449325862").build()))
                .build();
    }

    public AddBookDto defaultBookDtoBuilder(String isbn) {
        return AddBookDto.builder()
                .userId("20dd0c3e-a956-4794-b723-1db596966bf0")
                .collectionOfIsbns(List.of(IsbnDto.builder().isbn(isbn).build()))
                .build();
    }
}
