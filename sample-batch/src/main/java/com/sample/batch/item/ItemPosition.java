package com.sample.batch.item;

/**
 * μμ μμΉ
 */
public interface ItemPosition {

    String getSourceName();

    void setSourceName(String sourceName);

    int getPosition();

    void setPosition(int position);

    default boolean isFirst() {
        return getPosition() == 1;
    }
}
