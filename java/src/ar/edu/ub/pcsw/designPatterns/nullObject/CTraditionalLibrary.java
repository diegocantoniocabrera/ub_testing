package ar.edu.ub.pcsw.designPatterns.nullObject;

import java.util.ArrayList;

public class CTraditionalLibrary implements ILibrary
{
    public CTraditionalLibrary()
    {
    }

    @Override
    public void addBook(IBook book)
    {
        this.m_books.add(book);
    }

    @Override
    public IBook book(String name)
    {
        for(IBook b : this.books())
        {
            if(b.name().contains(name))
            {
                return b;
            }
        }

        return null;
    }

    @Override
    public ArrayList<IBook> books()
    {
        return this.m_books;
    }

    @Override
    public IBook bookByISBN(String isbn)
    {
        for(IBook b : this.books())
        {
            if(b.isbn().equals(isbn))
            {
                return b;
            }
        }

        return null;
    }

    @Override
    public ArrayList<IBook> booksByAuthor(String author)
    {
        ArrayList<IBook> results = new ArrayList<>();
        for(IBook b : this.books())
        {
            if(b.author().contains(author))
            {
                results.add(b);
            }
        }
        return results;
    }

    private ArrayList<IBook> m_books = new ArrayList<>();
}
